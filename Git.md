Create a new repository on GitHub.
Open Git Bash.
Change the current working directory to your local project.
Initialize the local directory as a Git repository.

$ git init
Add the files in your new local repository. This stages them for the first commit.

$ git add .
Commit the files that you've staged in your local repository.

$ git commit -m "First commit"
At the top of your GitHub repository's Quick Setup page, click to copy the remote repository URL.

In the Command prompt, add the URL for the remote repository where your local repository will be pushed.

$ git remote add origin <remote repository URL>
# Sets the new remote
$ git remote -v
# Verifies the new remote URL
Push the changes in your local repository to GitHub.

$ git push origin master
