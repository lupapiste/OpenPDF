(defproject lupapiste/openpdf "1.0.6"
  :description "A fork of OpenPDF, which itself is a fork of iText 4.2.1"
  :url "https://github.com/lupapiste/OpenPDF"
  :license {:name "GNU General Lesser Public License (LGPL) version 3.0"
            :url "http://www.gnu.org/licenses/lgpl.html"}
  :scm {:name "git"
        :tag "lupapiste"
        :url "https://github.com/lupapiste/OpenPDF.git"
        :dir "openpdf"}
  :dependencies [[org.bouncycastle/bcprov-jdk15on "1.55"]
                 [org.bouncycastle/bcpkix-jdk15on "1.55"]]
  :java-source-paths ["src/main/java"]
  :source-paths ["src/main/java"]
  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[junit "4.12"]]}})
