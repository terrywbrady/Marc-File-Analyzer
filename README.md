Marc-File-Analyzer
==================

PURPOSE
Extension of the File-Analyzer using Marc4j.

File Analyzer Project Page: http://georgetown-university-libraries.github.io/File-Analyzer/

Marc4j library page: https://github.com/marc4j/marc4j


==================================================================================================

PREREQUISITES
- JDK 1.6 or higher (for build)
- JRE 1.6 or higher (for runtime)
- Maven (or you will need to compile the modules manually)
- Local build of the File-Analyzer

INSTALLATION
- Clone the File-Analyzer to your computer
- `mvn install`
- Download marc4j-2.6.0.jar file and load it to your local mvn repository
- `mvn install:install-file -Dfile=marc4j-2.6.0.jar -DgroupId=marc4j -DartifactId=marc4j -Dversion=2.6.0 -Dpackaging=jar`
- Clone this repository to your computer
- `mvn install`

=================================================================================================
License information is contained below.
-------------------------------------------------------------------------

Copyright (c) 2013, Georgetown University Libraries
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

