# What you need #

Eclipse, access to eclipse labs group, and SVN plug-in for eclipse. The links are tutorials on how to do it. If you get stuck send carlospadillanv@gmail an email.


### Step 1: Install SVN Plug-in to Eclipse ###
  1. In Eclipse go to **Help->Install New Software**
  1. In the **Work with** field put this URL in
> > _http://subclipse.tigris.org/update\_1.0.x_
  1. Click **Add** and name it _SVN_
  1. Check the box I believe is called _Subversion Client_
  1. Hit **Next** and continue through the windows until it is installed
  1. Restart your Browser once it's done.

### Step 2: Set up Connection to Eclipse Labs Group ###
  1. In Eclipse go to **Window->Open Perspective->Other**
  1. Select **SVN Repository Exploring**
  1. In this new perspective right click the SVN Repositories tab and select **New->Repository Location**
  1. Add this URL
> > _https://svn.codespot.com/a/eclipselabs.org/cpp-scheduler/trunk/_
  1. Click **Finish** and any projects in the repository should appear

### Step 3: Check in/Upload project to SVN server (Eclipse Labs) ###
  1. Right click the project you wish to upload to the server
  1. Select **Team->Share Project**
  1. Select the **SVN**
  1. Click **Next**
  1. Select the repository you just added and continue through the windows until you have uploaded.
  1. Select all files you wish to upload.
  1. Along the way you will be prompted for username and password
    * **Username** is your email
    * **Password** found by clicking **_googlecode.com password_** in the **Source Tab** of Eclipse labs.
> > > _http://code.google.com/a/eclipselabs.org/p/cpp-scheduler/source/checkout_

### Step 4: Future Use ###
  1. To upload updated code to an already shared project
    * **Team->Commit**
  1. To download code from SVN server
    * In SVN Perspective right click project
    * **Check out**


# Links #

**Best tutorial, use this first. Use others if you aren't sure what's going on in the video**
  * http://www.youtube.com/watch?v=FwGJZcCj1Yo

**Tutorial on overall process, however this example is specifically for google groups**
  * http://blog.msbbc.co.uk/2007/06/using-googles-free-svn-repository-with.html

**Tutorial on how to set up svn on eclipse**
  * http://www.ibm.com/developerworks/opensource/library/os-ecl-subversion/

# Alternatives #

You can use another SVN client but I think it's more convenient having the eclipse plug-in.