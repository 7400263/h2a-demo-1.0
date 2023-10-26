# 服务器

## 安装git

### ubuntu

apt-get install git

git config --global init.defaultBranch main

git config --global user.email "dev@git-server"
git config --global user.name "git-server"

mkdir -p git-repos/h2a-demo-1.0.git
cd git-repos/h2a-demo-1.0.git
git init --bare


# 本地
## 向服务器仓库提交初始代码
### IDEA
Git->manage remotes->add->URL:dev@localhost:/home/dev/git_repos/h2a-demo-1.0.git
执行push操作
按提示输入dev用户的密码

## 从服务器仓库获取并开始开发
通过版本控制新建项目->git->URL:dev@localhost:/home/dev/git_repos/h2a-demo-1.0.git
checkout main 分支（或者根据项目情况checkout其他分支）
