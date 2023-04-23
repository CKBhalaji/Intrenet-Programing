<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : books.xsl
    Created on : 23 April, 2023, 8:57 PM
    Author     : bhalaji
    Description:
        Purpose of transformation follows.
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Book List</title>
                <style>
                    .unavailable {
                    font-weight: bold;
                    color: red;
                    }
                    table, th, td {
                    border: 1px solid black;
                    border-collapse: collapse;
                    }
                </style>
            </head>
            <body>
                <h1>Book List</h1>
                <table >
                    <tr>
                        <th>Title</th>
                        <th>Price</th>
                    </tr>
                    <xsl:for-each select="books/book">
                        <xsl:if test="available='no'">
                            <tr class="unavailable">
                                <td>
                                    <xsl:value-of select="title"/>
                                </td>
                                <td>
                                    <xsl:value-of select="price"/>
                                </td>
                            </tr>
                        </xsl:if>
                        <xsl:if test="available='yes'">
                            <tr>
                                <td>
                                    <xsl:value-of select="title"/>
                                </td>
                                <td>
                                    <xsl:value-of select="price"/>
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
