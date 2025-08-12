# Git Hands-On Lab 4: Conflict Resolution During Merge

## Objectives
- Explain how to resolve the conflict during merge

## Learning Outcomes
In this hands-on lab, you will learn how to:
- Implement conflict resolution when multiple users are updating the trunk (or master) in such a way that it results into a conflict with the branch's modification

## Prerequisites
The following are the pre-requisites to complete this hands-on lab:
- Hands-on ID: "Git-T03-HOL_001"

## Notes
- Please follow the below steps for creating a free account in GitHub
- Do not use Cognizant credentials to login to GitHub
- Estimated time to complete this lab: 30 minutes

## Lab Overview
This lab focuses on resolving merge conflicts that commonly occur when multiple users work on the same files in different branches. You will create a scenario where conflicts arise and learn how to resolve them using various tools and techniques.

## Step-by-Step Instructions

### Step 1: Verify Master Clean State
First, ensure the master branch is in a clean state:
```bash
$ git status
```
You should see "working tree clean" if there are no uncommitted changes.

### Step 2: Create Branch and Add File
Create a branch named "GitWork" and add a file "hello.xml":
```bash
$ git checkout -b GitWork
$ echo "<greeting>Hello from GitWork branch</greeting>" > hello.xml
```

### Step 3: Update Content and Observe Status
Update the content of "hello.xml" and observe the status:
```bash
$ echo "<greeting>Hello from GitWork branch - Updated content</greeting>" > hello.xml
$ git status
```
You should see hello.xml as modified.

### Step 4: Commit Changes to Branch
Commit the changes to reflect in the branch:
```bash
$ git add hello.xml
$ git commit -m "Add hello.xml with greeting message in GitWork branch"
```

### Step 5: Switch to Master
Switch back to the master branch:
```bash
$ git checkout master
```

### Step 6: Add File to Master with Different Content
Add a file "hello.xml" to the master with different content:
```bash
$ echo "<greeting>Hello from master branch</greeting>" > hello.xml
$ echo "<message>This is master branch content</message>" >> hello.xml
```

### Step 7: Commit Changes to Master
Commit the changes to the master:
```bash
$ git add hello.xml
$ git commit -m "Add hello.xml with different content in master branch"
```

### Step 8: Observe Log
Observe the log by executing:
```bash
$ git log --oneline --graph --decorate --all
```
This shows the commit history with both branches and their diverging paths.

### Step 9: Check Differences with Git Diff Tool
Check the differences between master and GitWork branch:
```bash
$ git diff master..GitWork
```
This shows the differences between the two branches.

### Step 10: Use P4Merge for Better Visualization
For better visualization, use P4Merge tool to list out all the differences:
```bash
$ git difftool -t p4merge master..GitWork
```
This opens P4Merge to show visual differences between the branches.

### Step 11: Merge Branch to Master
Merge the branch to the master:
```bash
$ git merge GitWork
```
This will result in a merge conflict since both branches modified the same file.

### Step 12: Observe Git Markup
Observe the git markup in the conflicted file:
```bash
$ cat hello.xml
```
You should see conflict markers like:
```xml
<<<<<<< HEAD
<greeting>Hello from master branch</greeting>
<message>This is master branch content</message>
=======
<greeting>Hello from GitWork branch - Updated content</greeting>
>>>>>>> GitWork
```

### Step 13: Use 3-Way Merge Tool to Resolve Conflict
Use a 3-way merge tool to resolve the conflict:
```bash
$ git mergetool -t p4merge
```
Or manually edit the file to resolve conflicts by choosing which content to keep.

### Step 14: Commit Changes After Conflict Resolution
Commit the changes to the master once done with conflict resolution:
```bash
$ git add hello.xml
$ git commit -m "Resolve merge conflict in hello.xml"
```

### Step 15: Observe Git Status and Add Backup to .gitignore
Observe the git status and add backup file to the .gitignore file:
```bash
$ git status
$ echo "*.orig" >> .gitignore
$ echo "*.BACKUP" >> .gitignore
$ echo "*.BASE" >> .gitignore
$ echo "*.LOCAL" >> .gitignore
$ echo "*.REMOTE" >> .gitignore
```

### Step 16: Commit .gitignore Changes
Commit the changes to the .gitignore:
```bash
$ git add .gitignore
$ git commit -m "Add backup files to .gitignore"
```

### Step 17: List All Available Branches
List out all the available branches:
```bash
$ git branch -a
```

### Step 18: Delete the Merged Branch
Delete the branch which was merged to master:
```bash
$ git branch -d GitWork
```

### Step 19: Observe Final Log
Observe the log by executing:
```bash
$ git log --oneline --graph --decorate
```
This shows the final commit history with the merge commit.

## Understanding Merge Conflicts

### What Causes Conflicts?
Merge conflicts occur when:
- Two branches modify the same lines in the same file
- One branch deletes a file while another modifies it
- Both branches add different content to the same location

### Conflict Markers Explained
```xml
<<<<<<< HEAD
Content from current branch (master)
=======
Content from branch being merged (GitWork)
>>>>>>> GitWork
```

### Resolving Conflicts
1. **Manual Resolution**: Edit the file directly
2. **Using Merge Tools**: Use P4Merge or other visual tools
3. **Accepting One Version**: Choose one branch's version entirely
4. **Combining Content**: Merge content from both branches

## Advanced Conflict Resolution Techniques

### Aborting a Merge
If you want to start over:
```bash
$ git merge --abort
```

### Using Different Merge Strategies
```bash
# Recursive merge (default)
$ git merge --strategy=recursive branch-name

# Ours strategy (prefer current branch)
$ git merge --strategy=ours branch-name

# Theirs strategy (prefer incoming branch)
$ git merge --strategy=theirs branch-name
```

### Resolving Specific File Conflicts
```bash
# Check which files have conflicts
$ git status

# Resolve specific file
$ git checkout --ours filename    # Keep current version
$ git checkout --theirs filename  # Keep incoming version
```

## Verification Checklist
- [ ] Master branch is in clean state initially
- [ ] GitWork branch is created successfully
- [ ] hello.xml file is added to GitWork branch
- [ ] Changes are committed to GitWork branch
- [ ] Successfully switched to master branch
- [ ] hello.xml file is added to master with different content
- [ ] Changes are committed to master branch
- [ ] Git log shows diverging branches
- [ ] Differences between branches are visible
- [ ] P4Merge tool shows visual differences
- [ ] Merge attempt results in conflict
- [ ] Conflict markers are visible in hello.xml
- [ ] Conflict is resolved using merge tool
- [ ] Changes are committed after conflict resolution
- [ ] Backup files are added to .gitignore
- [ ] .gitignore changes are committed
- [ ] All branches are listed
- [ ] GitWork branch is deleted after merging
- [ ] Final log shows complete merge history

## Common Issues and Solutions

### Issue: Merge tool not found
**Solution:** Install P4Merge or configure alternative:
```bash
$ git config --global merge.tool p4merge
$ git config --global mergetool.p4merge.path "path/to/p4merge"
```

### Issue: Cannot delete branch
**Solution:** Ensure branch is fully merged:
```bash
$ git branch --merged
$ git branch -d branch-name
```

### Issue: Conflict resolution incomplete
**Solution:** Check status and complete resolution:
```bash
$ git status
$ git add .
$ git commit
```

## Summary
This lab demonstrates essential conflict resolution skills:
- Creating scenarios that generate merge conflicts
- Understanding conflict markers and their meaning
- Using visual tools for conflict resolution
- Proper conflict resolution workflow
- Managing backup files and .gitignore
- Clean branch management after merging

By completing this lab, you will have hands-on experience with one of the most important Git skills - resolving merge conflicts that commonly occur in collaborative development environments.
