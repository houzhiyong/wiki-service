package io.choerodon.wiki.infra.feign;

import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * Created by Zenger on 2018/7/3.
 */
public interface WikiClient {

    //webHome
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace1WebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace2WebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace3WebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    //WebPreferences
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/pages/WebPreferences?objects=true")
    Call<ResponseBody> createSpace1WebPreferences(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/WebPreferences?objects=true")
    Call<ResponseBody> createSpace2WebPreferences(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/pages/WebPreferences?objects=true")
    Call<ResponseBody> createSpace3WebPreferences(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);


    //codeWebHome
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace1CodeWebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace2CodeWebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/WebHome?objects=true")
    Call<ResponseBody> createSpace3CodeWebHome(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    //spaceClass
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/{param2}Class?objects=true")
    Call<ResponseBody> createSpace1Class(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/{param3}Class?objects=true")
    Call<ResponseBody> createSpace2Class(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/{param4}Class?objects=true")
    Call<ResponseBody> createSpace3Class(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("param4") String param4,
            @Body RequestBody xmlParam);

    //sheet
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/{param2}Sheet?objects=true")
    Call<ResponseBody> createSpace1Sheet(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/{param3}Sheet?objects=true")
    Call<ResponseBody> createSpace2Sheet(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/{param4}Sheet?objects=true")
    Call<ResponseBody> createSpace3Sheet(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("param4") String param4,
            @Body RequestBody xmlParam);

    //template
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/{param2}Template?objects=true")
    Call<ResponseBody> createSpace1Template(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/{param3}Template?objects=true")
    Call<ResponseBody> createSpace2Template(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/{param4}Template?objects=true")
    Call<ResponseBody> createSpace3Template(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("param4") String param4,
            @Body RequestBody xmlParam);

    //templateProvider
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/{param2}TemplateProvider?objects=true")
    Call<ResponseBody> createSpace1TemplateProvider(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/{param3}TemplateProvider?objects=true")
    Call<ResponseBody> createSpace2TemplateProvider(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/{param4}TemplateProvider?objects=true")
    Call<ResponseBody> createSpace3TemplateProvider(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("param4") String param4,
            @Body RequestBody xmlParam);

    //translations
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/Code/pages/{param2}Translations?objects=true")
    Call<ResponseBody> createSpace1Translations(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/Code/pages/{param3}Translations?objects=true")
    Call<ResponseBody> createSpace2Translations(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/spaces/Code/pages/{param4}Translations?objects=true")
    Call<ResponseBody> createSpace3Translations(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("param4") String param4,
            @Body RequestBody xmlParam);

    //user
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/XWiki/pages/{param1}?objects=true")
    Call<ResponseBody> createUser(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Body RequestBody xmlParam);

    @GET("/rest/wikis/{client}/spaces/XWiki/pages/{param1}?objects=true")
    Call<ResponseBody> checkDocExsist(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1);

    @GET("/rest/wikis/{client}/spaces/{param1}/pages/{page}?objects=true")
    Call<ResponseBody> checkOrgSpaceExsist(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("page") String page);

    @GET("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/{page}?objects=true")
    Call<ResponseBody> checkProjectSpaceExsist(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("page") String page);

    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{client}/spaces/XWiki/pages/{groupName}?objects=true")
    Call<ResponseBody> createGroup(
            @Header("username") String username,
            @Path("client") String client,
            @Path("groupName") String groupName,
            @Body RequestBody xmlParam);

    @Headers({"Content-Type:application/x-www-form-urlencoded;charset=UTF-8"})
    @POST("/rest/wikis/{client}/spaces/XWiki/pages/{param1}/objects")
    Call<ResponseBody> createGroupUsers(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Body FormBody body);

    @Headers({"Content-Type:application/x-www-form-urlencoded;charset=UTF-8"})
    @POST("/rest/wikis/{client}/spaces/{organization}/pages/WebPreferences/objects")
    Call<ResponseBody> offerRightToOrgGroupView(
            @Header("username") String username,
            @Path("client") String client,
            @Path("organization") String organization,
            @Body FormBody body);

    @Headers({"Content-Type:application/x-www-form-urlencoded;charset=UTF-8"})
    @POST("/rest/wikis/{client}/spaces/{organization}/spaces/{project}/pages/WebPreferences/objects")
    Call<ResponseBody> offerRightToProjectGroupView(
            @Header("username") String username,
            @Path("client") String client,
            @Path("organization") String organization,
            @Path("project") String project,
            @Body FormBody body);

    //获取组织页面资源
    @GET("/rest/wikis/{client}/spaces/{param1}/pages/{param2}/objects/{className}")
    Call<ResponseBody> getPageClassResource(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("className") String className);

    //获取项目页面资源
    @GET("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/{param3}/objects/{className}")
    Call<ResponseBody> getProjectPageClassResource(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("className") String className);

    //删除组织页面里的对象
    @DELETE("/rest/wikis/{client}/spaces/{param1}/pages/{name}/objects/{className}/{objectNumber}")
    Call<ResponseBody> deletePageClass(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("name") String name,
            @Path("className") String className,
            @Path("objectNumber") int objectNumber);

    //删除项目页面里的对象
    @DELETE("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/{name}/objects/{className}/{objectNumber}")
    Call<ResponseBody> deleteProjectPageClass(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("name") String name,
            @Path("className") String className,
            @Path("objectNumber") int objectNumber);

    //删除页面
    @DELETE("/rest/wikis/{client}/spaces/{space}/pages/{name}?objects=true")
    Call<ResponseBody> deletePage(
            @Header("username") String username,
            @Path("client") String client,
            @Path("space") String space,
            @Path("name") String name);

    //删除页面
    @DELETE("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/pages/{name}?objects=true")
    Call<ResponseBody> deletePage1(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("name") String name);

    //删除页面
    @DELETE("/rest/wikis/{client}/spaces/{param1}/spaces/{param2}/spaces/{param3}/pages/{name}?objects=true")
    Call<ResponseBody> deletePage2(
            @Header("username") String username,
            @Path("client") String client,
            @Path("param1") String param1,
            @Path("param2") String param2,
            @Path("param3") String param3,
            @Path("name") String name);

    //修改wiki的logo
    @Headers({"Content-Type:application/xml;charset=UTF-8"})
    @PUT("/rest/wikis/{wikiName}/spaces/{spaceName}/pages/{pageName}/objects/{className}/{objectNumber}")
    Call<ResponseBody> updateObject(
            @Header("username") String username,
            @Path("wikiName") String wikiName,
            @Path("spaceName") String spaceName,
            @Path("pageName") String pageName,
            @Path("className") String className,
            @Path("objectNumber") Integer objectNumber,
            @Body RequestBody xmlParam);
}
