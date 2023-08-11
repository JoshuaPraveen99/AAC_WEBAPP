git init -----> to make a folder as git repo.
git clone ------> to clone a repo from github
git checkout -----> used to change branches.
git status----> used to find the untracked files and changes 
git add ------> used to add the new added files or changes to the staging area
git commit -m "message" ---> used to commit the changes to the git repo in local system.
git push origin <branchname> -----> used to push the changes to the remote.
git pull origin <branchname> -----> used to pull the changes from the remote.
git merge <branchname> -------> used to merge the changes of the <branchname> to the current branch
git fetch ----> used to feth changes from the upstream (It has to be set.)
git remote add upstream <original_repository_url> ----> If you fork a repository from github to pull changes from the master repo add the repo url as upstream.
git fetch upstream ----> used to fetch the changes from upstream repo
git mergre upstream/main ---> used to merge the changes from the upstream-main to your local branch (Then push into your origin)
git branch --set-upstream-to=upstream/branch-name local-branch-name  ----> to set a particular  upstream branch for your local branch
git push -u upstream <local branch_name> -----> local branch changes to upstream repo.
