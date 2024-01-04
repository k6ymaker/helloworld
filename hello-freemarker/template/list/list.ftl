<#if vo?size == 0>
    size:0
<#else>
    size!=0
</#if>

<#list vo as value>
    <td>${value!''}</td>
</#list>


<#list ["hello","world"] as value>
    ${value} <#if value_has_next>,</#if> <!--最后一个不显示-->
</#list>