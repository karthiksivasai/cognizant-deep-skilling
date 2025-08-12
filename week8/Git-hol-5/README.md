# Git Hands-On Lab 5: Clean Up and Push Back to Remote Git

## Objectives
- Explain how to clean up and push back to remote Git

## Learning Outcomes
In this hands-on lab, you will learn how to:
- Execute steps involving clean up and push back to remote Git

## Prerequisites
The following are the pre-requisites to complete this hands-on lab:
- Hands-on ID: "Git-T03-HOL_002"

## Notes
- Please follow the below steps for creating a free account in GitHub
- Do not use Cognizant credentials to login to GitHub
- Estimated time to complete this lab: 10 minutes

## Lab Overview
This lab focuses on the final steps of a Git workflow - cleaning up your local repository and pushing changes back to the remote repository. You will learn how to ensure your local master branch is clean, synchronize with the remote repository, and push pending changes.

## Step-by-Step Instructions

### Step 1: Verify Master Clean State
First, ensure the master branch is in a clean state:
```bash
$ git status
```
You should see "working tree clean" if there are no uncommitted changes. If there are uncommitted changes, commit them first:
```bash
$ git add .
$ git commit -m "Complete pending changes before cleanup"
```

### Step 2: List All Available Branches
List out all the available branches to see what needs to be cleaned up:
```bash
$ git branch -a
```
This shows both local and remote branches. Look for any local branches that have been merged and can be deleted.

### Step 3: Pull Remote Git Repository to Master
Pull the remote git repository to the master to ensure you have the latest changes:
```bash
$ git pull origin master
```
This fetches and merges any changes from the remote master branch to your local master branch.

### Step 4: Push Pending Changes to Remote Repository
Push the changes, which are pending from "Git-T03-HOL_002" to the remote repository:
```bash
$ git push origin master
```
This pushes all your local commits to the remote repository.

### Step 5: Observe Changes in Remote Repository
Observe if the changes are reflected in the remote repository:
```bash
$ git log --oneline -5
$ git remote -v
```
You can also check the remote repository through your GitLab/GitHub web interface to verify the changes.

## Additional Cleanup and Maintenance Commands

### Clean Up Merged Branches
Remove local branches that have been merged to master:
```bash
# List merged branches
$ git branch --merged

# Delete merged branches
$ git branch -d branch-name

# Force delete unmerged branches (use with caution)
$ git branch -D branch-name
```

### Clean Up Remote Tracking Branches
Remove references to deleted remote branches:
```bash
# Prune remote tracking branches
$ git remote prune origin

# Or use fetch with prune
$ git fetch --prune
```

### Clean Up Stash
If you have any stashed changes that are no longer needed:
```bash
# List all stashes
$ git stash list

# Drop specific stash
$ git stash drop stash@{n}

# Clear all stashes
$ git stash clear
```

### Clean Up Untracked Files
Remove untracked files and directories:
```bash
# Show what would be removed (dry run)
$ git clean -n

# Remove untracked files
$ git clean -f

# Remove untracked files and directories
$ git clean -fd
```

## Remote Repository Management

### Check Remote Status
```bash
# Show remote branches
$ git branch -r

# Show remote information
$ git remote show origin

# Check if local is ahead/behind remote
$ git status -uno
```

### Force Push (Use with Caution)
Only use when you're sure about overwriting remote changes:
```bash
$ git push --force-with-lease origin master
```
This is safer than `--force` as it checks if someone else has pushed changes.

### Reset and Push
If you need to reset your local branch to match remote:
```bash
$ git fetch origin
$ git reset --hard origin/master
$ git push origin master
```

## Verification Checklist
- [ ] Master branch is in clean state
- [ ] All available branches are listed
- [ ] Remote repository is pulled to master successfully
- [ ] Pending changes are pushed to remote repository
- [ ] Changes are reflected in remote repository
- [ ] Local repository is synchronized with remote
- [ ] No uncommitted changes remain
- [ ] All merged branches are cleaned up

## Common Issues and Solutions

### Issue: Cannot push to remote
**Solution:** Pull first, then push:
```bash
$ git pull origin master
$ git push origin master
```

### Issue: Remote branch is ahead
**Solution:** Pull and merge remote changes:
```bash
$ git pull origin master
$ git push origin master
```

### Issue: Untracked files preventing clean state
**Solution:** Add and commit or ignore:
```bash
$ git add .
$ git commit -m "Add untracked files"
# OR
$ echo "filename" >> .gitignore
```

### Issue: Local branch behind remote
**Solution:** Reset to match remote:
```bash
$ git fetch origin
$ git reset --hard origin/master
```

## Best Practices for Cleanup

### Before Pushing
1. Ensure all changes are committed
2. Pull latest changes from remote
3. Resolve any conflicts
4. Test your changes locally

### After Pushing
1. Verify changes appear in remote repository
2. Clean up merged branches
3. Update documentation if needed
4. Notify team members of changes

### Regular Maintenance
1. Weekly cleanup of merged branches
2. Monthly review of remote tracking branches
3. Regular synchronization with remote
4. Keep .gitignore updated

## Summary
This lab covers essential Git cleanup and remote synchronization:
- Verifying local repository state
- Synchronizing with remote repository
- Pushing changes to remote
- Cleaning up merged branches
- Maintaining repository hygiene

By completing this lab, you will have mastered the final steps of the Git workflow, ensuring your local repository stays clean and synchronized with the remote repository. This is crucial for maintaining a healthy development environment and collaborating effectively with team members.
