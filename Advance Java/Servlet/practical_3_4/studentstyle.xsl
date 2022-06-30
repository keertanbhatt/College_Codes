<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <h2>My CD Collection</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th style="text-align:left">PEN</th>
                        <th style="text-align:left">FirstName</th>
                        <th style="text-align:left">LastName</th>
                        <th style="text-align:left">Semester</th>
                        <th style="text-align:left">MobileNumber</th>
                    </tr>
                    <xsl:for-each select="catalog/cd">
                        <tr>
                            <td>
                                <xsl:value-of select="pen"/>
                            </td>
                            <td>
                                <xsl:value-of select="firstname"/>
                            </td>
                            <td>
                                <xsl:value-of select="lastname"/>
                            </td>
                            <td>
                                <xsl:value-of select="semester"/>
                            </td>
                            <td>
                                <xsl:value-of select="mobilenumber"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
