<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <!-- Identity template: copies all text nodes, elements, and attributes -->
    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

    <!-- Root template -->
    <xsl:template match="/">
        <html>
            <head>
                <title>Book List</title>
            </head>
            <body>
                <h1>Books</h1>
                <ul>
                    <xsl:apply-templates select="bookstore/book"/>
                </ul>
            </body>
        </html>
    </xsl:template>

    <!-- Template for each book -->
    <xsl:template match="book">
        <li>
            <strong><xsl:value-of select="title"/></strong>
            - <xsl:value-of select="author"/>
            (<xsl:value-of select="year"/>)
        </li>
    </xsl:template>

</xsl:stylesheet>
