<#if hello?exists>
    ${hello}
<#else>
    no exists hello
</#if>


<#if hello_array?exists && hello_array? size != 0>
    hello_array exists and size not eq 0
<#else>
    no exists hello_array
</#if>
