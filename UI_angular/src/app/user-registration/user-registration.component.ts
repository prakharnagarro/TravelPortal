import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { CountriesService } from '../countries.service';
import { RegistrationService } from '../registration.service';
import { error } from '@angular/compiler/src/util';

function emailDomainValidator(control: FormControl) {
  let email = control.value;
  if (email && email.indexOf("@") != -1) {
    let [_, domain] = email.split("@");
    if (domain !== "nagarro.com") {
      return {
        emailDomain: {
          parsedDomain: domain
        }
      };
    }
  }
  return null;
}

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent implements OnInit {

  stateInfo: any[] = [];
  countryInfo: any[] = [];
  cityInfo: any[] = [];
  form = new FormGroup({
    fname: new FormControl('', [Validators.required, Validators.minLength(3)]),
    email: new FormControl('', [Validators.required, emailDomainValidator]),
    tel: new FormControl('', [ Validators.required, Validators.maxLength(15)]),
    add1: new FormControl('', [Validators.required]),
    zcode: new FormControl('', [Validators.required]),
    city: new FormControl('', [Validators.required]),
    lname: new FormControl('', [Validators.required]),
    bunit: new FormControl('', [Validators.required]),
    title: new FormControl('', [Validators.required]),
    country: new FormControl('', [Validators.required]),
    state: new FormControl('', [Validators.required]),
  });
  get f(){
    return this.form.controls;
  }
  constructor(private  country: CountriesService, private rservice: RegistrationService ) { }
  ngOnInit() {
    this.getCountries();
  }


  getCountries(){
    this.country.allCountries().
    subscribe(
      data2 => {
        this.countryInfo = data2.Countries;
        //console.log('Data:', this.countryInfo);
      },
      err => console.log(err),
      () => console.log('complete')
    )
  }

  onChangeCountry(countryValue) {
    this.stateInfo = this.countryInfo[countryValue].States;
    this.cityInfo = this.stateInfo[0].Cities;
    console.log(this.cityInfo);
  }

  onChangeState(stateValue) {
    this.cityInfo = this.stateInfo[stateValue].Cities;
    //console.log(this.cityInfo);
  }


  onSubmit()
  {
    this.rservice.register(this.form.value)
    .subscribe(
      data => console.log('Success!', data),
      error => console.log('Error!', error)
    );
  }
}
