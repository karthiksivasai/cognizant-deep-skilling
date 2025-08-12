# Git Hands-On Lab 3: Branching and Merging

## Objectives
- Explain branching and merging
- Explain about creating a branch request in GitLab
- Explain about creating a merge request in GitLab

## Learning Outcomes
In this hands-on lab, you will learn how to:
- Construct a branch, do some changes in the branch, and merge it with master (or trunk)

## Prerequisites
The following are the pre-requisites to complete this hands-on lab:
- Setting up Git environment with P4Merge tool for Windows

## Notes
- Please follow the below steps for creating a free account in GitHub
- Do not use Cognizant credentials to login to GitHub
- Estimated time to complete this lab: 30 minutes

## Lab Overview
This lab covers the fundamental concepts of Git branching and merging. You will create a new branch, make changes, and then merge those changes back to the master branch. You'll also learn about visual diff tools and branch management.

## Step-by-Step Instructions

### Branching Section

#### Step 1: Create a New Branch
Create a new branch named "GitNewBranch":
```bash
$ git branch GitNewBranch
```

#### Step 2: List All Branches
List all local and remote branches available in the current trunk:
```bash
$ git branch -a
```
Observe the "*" mark which denotes the current pointing branch.

#### Step 3: Switch to the New Branch
Switch to the newly created branch:
```bash
$ git checkout GitNewBranch
```
Or using the newer syntax:
```bash
$ git switch GitNewBranch
```

#### Step 4: Add Files to the Branch
Add some files to the branch with content:
```bash
$ echo "This is a new feature file" > feature.txt
$ echo "Another file for the branch" > branch-file.txt
$ mkdir new-feature
$ echo "Feature documentation" > new-feature/README.md
```

#### Step 5: Commit Changes to the Branch
Commit the changes to the branch:
```bash
$ git add .
$ git commit -m "Add new feature files to GitNewBranch"
```

#### Step 6: Check Branch Status
Check the status with "git status" command:
```bash
$ git status
```

### Merging Section

#### Step 1: Switch to Master Branch
Switch back to the master branch:
```bash
$ git checkout master
```
Or using the newer syntax:
```bash
$ git switch master
```

#### Step 2: List Differences Between Branches
List out all the differences between trunk and branch using command line interface:
```bash
$ git diff master..GitNewBranch
```
This shows the differences between master and GitNewBranch.

#### Step 3: Visual Differences Using P4Merge
List out all the visual differences between master and branch using P4Merge tool:
```bash
$ git difftool -t p4merge master..GitNewBranch
```
This opens P4Merge to show visual differences between the branches.

#### Step 4: Merge the Source Branch to Trunk
Merge the source branch to the trunk:
```bash
$ git merge GitNewBranch
```
This will merge all changes from GitNewBranch into the current master branch.

#### Step 5: Observe Logging After Merging
Observe the logging after merging using:
```bash
$ git log --oneline --graph --decorate
```
This shows the commit history with a visual graph showing the merge.

#### Step 6: Delete the Branch After Merging
Delete the branch after merging with the trunk:
```bash
$ git branch -d GitNewBranch
```
Then observe the git status:
```bash
$ git status
```

## Additional Branching and Merging Commands

### Branch Management
```bash
# Create and switch to a new branch in one command
$ git checkout -b feature-branch

# Rename a branch
$ git branch -m old-name new-name

# List only local branches
$ git branch

# List only remote branches
$ git branch -r

# Show branch information
$ git show-branch
```

### Merge Strategies
```bash
# Fast-forward merge (when possible)
$ git merge --ff-only branch-name

# Create a merge commit always
$ git merge --no-ff branch-name

# Abort a merge if conflicts occur
$ git merge --abort
```

### Conflict Resolution
If merge conflicts occur:
```bash
# See which files have conflicts
$ git status

# Open conflicted files in your editor
$ git diff

# After resolving conflicts, add and commit
$ git add .
$ git commit -m "Resolve merge conflicts"
```

## GitLab Integration

### Creating a Branch Request
1. In GitLab, navigate to your project
2. Click on "Repository" → "Branches"
3. Click "New branch" button
4. Enter branch name and select source branch
5. Click "Create branch"

### Creating a Merge Request
1. In GitLab, navigate to your project
2. Click on "Merge Requests" → "New merge request"
3. Select source branch (your feature branch)
4. Select target branch (usually master/main)
5. Fill in title and description
6. Click "Create merge request"

## Verification Checklist
- [ ] New branch "GitNewBranch" is created
- [ ] Successfully switched to the new branch
- [ ] Files are added and committed to the branch
- [ ] Successfully switched back to master branch
- [ ] Differences between branches are visible
- [ ] Visual diff tool (P4Merge) shows differences
- [ ] Branch is successfully merged to master
- [ ] Git log shows merge commit with graph
- [ ] Branch is deleted after successful merge
- [ ] Git status shows clean working directory

## Common Issues and Solutions

### Issue: Cannot delete branch
**Solution:** Ensure the branch has been fully merged:
```bash
$ git branch --merged
$ git branch -d branch-name
```

### Issue: Merge conflicts
**Solution:** Resolve conflicts manually and then commit:
```bash
$ git status
$ git diff
# Edit conflicted files
$ git add .
$ git commit
```

### Issue: P4Merge not found
**Solution:** Install P4Merge or configure a different diff tool:
```bash
$ git config --global diff.tool p4merge
$ git config --global difftool.p4merge.path "path/to/p4merge"
```

## Summary
This lab demonstrates essential Git branching and merging concepts:
- Creating and managing branches
- Making changes in separate branches
- Comparing differences between branches
- Merging changes back to master
- Using visual diff tools
- Proper branch cleanup after merging

By completing this lab, you will have hands-on experience with Git's powerful branching and merging capabilities, which are essential for collaborative development workflows.
