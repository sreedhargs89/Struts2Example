# Struts2Example
Example Projects for Struts2

Instructions:<br>
1. Download Struts2 package from apache, we need libraries during application development. <br>
2. Create a Dynamic Web Project: <br>
Start your Eclipse and then go with File > New > Dynamic Web Projectand enter project name <br>
3. Select all the default options in the next screens and finally check Generate Web.xml deployment descriptor option. This will create a dynamic web project for you in Eclipse. Now go with Windows > Show View > Project Explorer, and you will see your project window something as below:<br>
4. Now copy following files from struts 2 lib folder C:\struts-2.2.3\lib to our project's WEB-INF\lib folder. To do this, you can simply drag and drop all the following files into WEB-INF\lib folder.<br>
		• commons-fileupload-x.y.z.jar<br>
		• commons-io-x.y.z.jar<br>
		• commons-lang-x.y.jar<br>
		• commons-logging-x.y.z.jar<br>
		• commons-logging-api-x.y.jar<br>
		• freemarker-x.y.z.jar<br>
		• javassist-.xy.z.GA<br>
		• ognl-x.y.z.jar<br>
		• struts2-core-x.y.z.jar<br>
		• xwork-core.x.y.z.jar<br>
You can also create user library including all above jar files.<br>
4. Also add the jar files to deployment descriptor to make sure these available as part of deployable war<br>
5. Create struts.xml file to map the action to the action class<br>
 Action class execute methods return type will decide which jsp page to display.<br>
success --> Displays success.jsp<br>
failure --> Displays error.jsp<br>
	
6. In web applications all requests routed by the web.xml with the help of servlet mapping, whereas in struts framework we can see all requests intercepted and routed by the struts.xml..?
Reason for this is, filter mapping in web.xml
	
	    <filter>
	        <filter-name>struts2</filter-name>
	        <filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
	    </filter>
	    
	     <filter-mapping>
	        <filter-name>struts2</filter-name>
	        <url-pattern>/*</url-pattern>
	    </filter-mapping>
	
