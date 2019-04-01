# RoboPods

RoboPods are high-quality RoboVM code libraries and bindings for the most popular 3rd party services 
like social media integration, ad networks or crash reporting. Just add a RoboPod dependency to your 
project and you are ready-to-go!

Do you want to add in-app-purchases, display dialogs, or just store some preferences in your app in a cross-platform way? 
Look no further, RoboPods Plugins are here to help!
The RoboPods Plugins are cross-platform libraries that abstract platform specific functionality to a common API.
Add the dependencies to your project and start coding without thinking about platform-specific implementations!

## Usage

A RoboPod comes in form of a simple JAR file published to Maven Central so you can easily 
integrate it with Maven or Gradle.
Add a depencency to your Maven or Gradle build files, download native frameworks, define frameworks in robovm.xml and you are ready to go!

### Versioning

It is recommended that you define the RoboPods version number globally in your build system, 
so you can refer to that when adding dependencies.

#### Gradle

In your project's root `build.gradle` file add the following at the top of the `buildscript` section:

```gradle
buildscript {
   project.ext.robopodsVersion = "2.2.2"
}
```

When you add a dependency, you can refer to the variable like this:

```gradle
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-facebook-ios:$robopodsVersion"
}
```

#### Maven

In your project's root `pom.xml` file add the following property:

```maven
<properties>
   <robopods.version>2.2.2</robopods.version>
</properties>
```

When you add a dependency, you can refer to the variable like this:

```maven
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-facebook-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

#### Add native frameworks

Native frameworks can be embedded in the Robopod jars, but often need to be added manually. A robopod jar has embedded its native frameworks if in path `META-INF/robovm/ios/libs/` `.framework` or `.a` files are present.

If natives are not present, you need to add them manually. Download the native frameworks, add them to the project and update robovm.xml.

Below an example if you'd like to use the Facebook SDK Share dialog.

Download the iOS SDK from [https://developers.facebook.com/docs/ios/downloads](https://developers.facebook.com/docs/ios/downloads)

Copy the Bolts.framework, FBSDKCoreKit.framework and FBSDKShareKit.framework
into ./lib (relative to robovm.xml)

Add to robovm.xml:
    
    <frameworkPaths>
        <path>lib</path>
    </frameworkPaths>
    
    
    <frameworks>
        ...
        <framework>Bolts</framework>
        <framework>FBSDKCoreKit</framework>
        <framework>FBSDKShareKit</framework>
        ...
    </frameworks>

#### Current versions

The RoboPods follow the same versioning as the core of RoboVM. 
To prevent compatibility issues make sure that you use the same version for the RoboPods and RoboVM.

The current stable version is:

> 2.2.2

If you want to use the latest and greatest of every RoboPod, use the latest snapshot version for your dependencies:

> 2.2.3-SNAPSHOT


## List of RoboPods

This is the list of currently available RoboPods. Click them to get more information like install instructions.

| Name                                                 | Description                                                                       |
|------------------------------------------------------|-----------------------------------------------------------------------------------|
| [RoboPods Plugins](plugins/)                         | The RoboPods Plugins are cross-platform libraries that abstract platform specific functionality to a common API. Whether you want to add in-app-purchases, display dialogs, or just store some preferences in your app; our Plugins got you covered! |
| [AppsFlyer](appsflyer/)                              | Mobile attribution & marketing analytics platform. |
| [Bolts](bolts/)                                      | This RoboPod is mainly used to make the Facebook and Parse RoboPods functional. Bolts is a collection of low-level libraries designed to make developing mobile apps easier. |
| [Fabric](fabric/)                                    | Twitter's Mobile Development Platform |
| [Facebook](facebook/)                                | Build, grow, and monetize your app with Facebook. The Facebook SDK allows you to natively integrate Facebook into your app. |
| [Firebase](firebase/)                                | Firebase Analytics and Firebase Messaging bindings. |
| [Flurry](flurry/)                                    | Measure, track and analyze app performance, user acquisition and activity with Flurry Analytics. |
| [Google Analytics](google-analytics/)                | Collect, configure, and analyze your data to reach the right audience. |
| [Google APIs](google-apis/)                          | Google APIs is used by several Google services such as Google Analytics to configure them in a single configuration file. |
| [Google Mobile Ads](google-mobile-ads/)              | AdMob is a mobile ads network. Gain insights about your users, drive more in-app purchases, and maximize your ad revenue. |
| [Google SignIn](google-signin/)                      | Get users into your apps quickly and securely, using a registration system they already use and trust—their Google account. |
| [Google Personalized Ad Consent](google-ad-consent/) | Obtain consent to serve personlized ads with AdMob from users within the EU. |
| [IronSource](ironsource/)                            | IronSource is a mobile ads network and mediation platform. |
| [Parse](parse/)                                      | Focus on creating a great user experience and stop worrying about server maintenance and complex infrastructure. |
| [Reachability](reachability/)                        | Monitor network reachability. |

## Creating/Updating RoboPods

Java bindings are generated semi-automatically with a Ruby script configured via a .yaml file [This tutorial] (https://dkimitsa.github.io/2017/10/19/bro-gen-tutorial/) explains how to create (and update) a RoboPod from scratch.
