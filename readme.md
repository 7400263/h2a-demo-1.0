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


本地
IDEA
Git->manage remotes->add->URL:dev@localhost:/home/dev/git_repos/h2a-demo-1.0.git
按提示输入dev用户的密码
