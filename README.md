UWCENTRAL
=============

How to setup the project

On Mac:

1) install homebrew with the following command
ruby -e "$(curl -fsSL https://raw.github.com/mxcl/homebrew/go/install)"

2) get RVM (Ruby Version Manager)
Check to see if you have rvm installed ("man rvm")
if yes, update using "rvm get stable"
else "curl -L https://get.rvm.io | bash"

3) install ruby 2.0.0-p353
brew install libyaml
rvm pkg install openssl
rvm install 2.0.0-p353 --with-openssl-dir=$HOME/.rvm/usr --verify-downloads 1

NOTE: to verify that ruby got installed, use "rvm list"

Set 2.0.0-p353 as your default
rvm --default use 2.0.0-p353

to verify, type in rvm list again and this time, it should look something like this. =* ruby-2.0.0-p353

4) install rails
gem install rails
or, gem install --no-rdoc --no-ri rails (if no documentation is needed)

try rails -v and it should say Rails 4.0.1

Congrats!! You've successfully got rails to install on your machine! Go eat a cookie now, you deserve it. :')

Now on to setting up the project. To be continued...


Troubleshooting:
For Linux, see https://rvm.io/integration/gnome-terminal
