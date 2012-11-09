(defproject incanter "1.4.0"
  :description "Incanter is a Clojure-based, R-like statistical programming and data visualization environment."
  :min-lein-version "2.0.0"
  :dependencies [[incanter/incanter-core "1.4.0"]
                 [incanter/incanter-io "1.4.0"]
                 [incanter/incanter-charts "1.4.0"]
                 [incanter/incanter-mongodb "1.4.0"]
                 [incanter/incanter-pdf "1.4.0"]
                 [incanter/incanter-latex "1.4.0"]
                 [incanter/incanter-excel "1.4.0"]
                 [swingrepl "1.3.0"
                  :exclusions [org.clojure/clojure
                               org.clojure/clojure-contrib]]
                 [jline "0.9.94"]]
  :main incanter.main

  :profiles {:dev {:resource-paths ["data"]}
             :debug {:debug true}
             }  
  :repl-options {:init-ns incanter.main
                 :init (do
                         (set! *print-length* 500)
                         (use 'clojure.repl))
                 }
  :jvm-opts ["-Xmx1g"]
  )