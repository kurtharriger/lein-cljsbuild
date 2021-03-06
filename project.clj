(defproject emezeske/lein-cljsbuild "0.0.5"
  :description "ClojureScript Autobuilder Plugin"
  :url "http://github.com/emezeske/lein-cljsbuild"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  ; TODO: These dependencies are also maintained in leiningen.cljsbuild.
  ;       Figure out some way to DRY them.
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [fs "0.11.1"]
                 [emezeske/clojurescript "0.0.2-0df1bc4d7b"]
                 [clj-stacktrace "0.2.3"]] 
  :eval-in-leiningen true)
