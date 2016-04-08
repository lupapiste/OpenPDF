# OpenPDF is a Java PDF library, forked from the venerable iText #

[![Clojars Project](http://clojars.org/lupapiste/openpdf/latest-version.svg)](http://clojars.org/lupapiste/openpdf)

## Background ##

This is a fork of OpenPDF that contains changes required for PDF processing in Lupapiste. It contains changes that are not
unambiguously fixes that should be contributed to upstream. It also includes a Leiningen project for the openpdf module which
is deployed to Clojars.

Releases are made from the branch lupapiste.

## Changes ##
This repo has the following changes from the old "original" 4.2.0 version:
 - compilation now also supports Java 8, but compatibility level in maven pom is set to Java 7
 - in the case of unexpected end of PDF file the IOException is thrown (not PDFNull)
 - merged patch from Steven to fix NPE in XFA Form (escapeSom method)
 - merged UnembedFontPdfSmartCopy functionality from Vicente Alencar
 - merged RTF Footer functionality from ubermichael
 - compatibility fix to support the newest (1.54) bouncy castle libraries based/inspired by flex-developments fixes
 - some NPE fixes and tweaked maven support

## Contributing ##
Please contribute to the original OpenPDF repository, https://github.com/rtfarte/OpenPDF

## Dependencies ##

### Required: ###

BouncyCastle:
  Provider
  PKIX/CMS

PDFRenderer

DOM4j

### Optional: ###
JUnit 4 - for unit testing

JFreeChart: - for testing graphical examples
  JFreeChart
  JCommon
  Servlet

## License ##

GNU General Lesser Public License (LGPL) version 3.0 - http://www.gnu.org/licenses/lgpl.html

Mozilla Public License Version 2.0 - http://www.mozilla.org/MPL/2.0/

  
