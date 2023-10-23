### Apache Struts 2.3

![example workflow](https://github.com/ISLEcode/struts2/actions/workflows/build.yml/badge.svg)

This is an active branch of Struts 2.3 which is no longer mainained by the Apache community.

We rely on this for several legacy applications which are still in operation.

The Maven build has been updated to ignore modules that don't [build out-of-the
box](https://github.com/ISLEcode/struts2/commit/5401171e3f2d36e482e70eba3fa67622109f334d).

```
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Struts 2 2.3.37:
[INFO]
[INFO] Struts 2 ........................................... SUCCESS [  2.706 s]
[INFO] XWork: Core ........................................ SUCCESS [ 26.796 s]
[INFO] Struts Plugins ..................................... SUCCESS [  0.317 s]
[INFO] Struts 2 Spring Plugin ............................. SUCCESS [  2.137 s]
[INFO] Struts 2 Convention Plugin ......................... SUCCESS [  3.751 s]
[INFO] Struts 2 JUnit Plugin .............................. SUCCESS [  4.858 s]
[INFO] Struts 2 Webapps ................................... SUCCESS [  0.552 s]
[INFO] Struts 2 Blank Webapp .............................. SUCCESS [  4.278 s]
[INFO] Struts 2 Mail Reader Webapp ........................ SUCCESS [  1.761 s]
[INFO] Struts 2 DWR Plugin ................................ SUCCESS [  0.923 s]
[INFO] Struts 2 Tiles Plugin .............................. SUCCESS [  1.227 s]
[INFO] Struts 2 Portlet Tiles Plugin ...................... SUCCESS [  0.908 s]
[INFO] Struts 2 Portlet Webapp ............................ SUCCESS [ 10.709 s]
[INFO] Struts 2 Struts 1 Plugin ........................... SUCCESS [  2.331 s]
[INFO] Struts 2 JSF Plugin ................................ SUCCESS [  0.641 s]
[INFO] Struts 2 Configuration Browser Plugin .............. SUCCESS [  0.679 s]
[INFO] Struts 2 Sitemesh Plugin ........................... SUCCESS [  0.865 s]
[INFO] Struts 2 JSON Plugin ............................... SUCCESS [  5.218 s]
[INFO] Struts 2 Showcase Webapp ........................... SUCCESS [  3.785 s]
[INFO] Struts 2 REST Plugin ............................... SUCCESS [  1.988 s]
[INFO] Struts 2 Rest Showcase Webapp ...................... SUCCESS [  1.705 s]
[INFO] Struts 2 CDI Plugin ................................ SUCCESS [  1.984 s]
[INFO] Struts 2 Codebehind Plugin ......................... SUCCESS [  2.510 s]
[INFO] Struts 2 Embedded JSP Plugin ....................... SUCCESS [  3.611 s]
[INFO] Struts 2 GXP Plugin ................................ SUCCESS [  0.753 s]
[INFO] Struts 2 Jasper Reports Plugin ..................... SUCCESS [  0.984 s]
[INFO] Struts 2 Java 8 support plugin ..................... SUCCESS [  0.794 s]
[INFO] Struts 2 Java Templates Plugin ..................... SUCCESS [  1.855 s]
[INFO] Struts 2 JFreeChart Plugin ......................... SUCCESS [  6.691 s]
[INFO] Struts 2 OSGi Plugin ............................... SUCCESS [  1.342 s]
[INFO] Struts 2 OVal Plugin ............................... SUCCESS [  3.826 s]
[INFO] Struts 2 Pell Multipart Plugin ..................... SUCCESS [  0.607 s]
[INFO] Struts 2 Plexus Plugin ............................. SUCCESS [  0.698 s]
[INFO] Struts 2 Sitegraph Plugin .......................... SUCCESS [  1.647 s]
[INFO] Struts 2 TestNG Plugin ............................. SUCCESS [  1.988 s]
[INFO] Struts 2 Tiles 3 Plugin ............................ SUCCESS [  1.276 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
