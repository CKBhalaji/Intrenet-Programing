<?php
$xmlFile = 'books.xml';
$xslFile = 'books.xsl';
// create an XSLT processor object
$xslt = new XSLTProcessor();
// load the XSLT stylesheet
$xslDoc = new DOMDocument();
$xslDoc->load($xslFile);
$xslt->importStylesheet($xslDoc);
// load the XML file and transform it with the XSLT stylesheet
$xmlDoc = new DOMDocument();
$xmlDoc->load($xmlFile);
$html = $xslt->transformToXML($xmlDoc);
// output the transformed HTML
echo $html;
?>
