UWCENTRAL
=============

How to setup the project

On Mac:

1) install homebrew with the following command
<code>ruby -e "$(curl -fsSL https://raw.github.com/mxcl/homebrew/go/install)"</code>

2) get RVM (Ruby Version Manager)
Check to see if you have rvm installed by using <code>man rvm</code>
if yes, update using <code>rvm get stable</code>
else <code>curl -L https://get.rvm.io | bash</code>

3) install ruby 2.0.0-p353
<code>brew install libyaml</code>
<code>rvm pkg install openssl</code>
<code>rvm install 2.0.0-p353 --with-openssl-dir=$HOME/.rvm/usr --verify-downloads 1</code>

To verify that ruby got installed, use <code>rvm list</code>

Set 2.0.0-p353 as your default
<code>rvm --default use 2.0.0-p353</code>

to verify, type in rvm list again and this time, it should look something like this. =* ruby-2.0.0-p353

4) install rails

<code>gem install rails</code>
or, <code>gem install --no-rdoc --no-ri rails</code> (if no documentation is needed/wanted)

try <code>rails -v</code> and it should say <code>Rails 4.0.1</code>

Congrats!! You've successfully got rails to install on your machine! Go eat a cookie now, you deserve it. :')

Now on to setting up the project. To be continued...


Troubleshooting:
For Linux, see https://rvm.io/integration/gnome-terminal
