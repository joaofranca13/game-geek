(defproject clojure-game-geek "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  ;:plugins [[cider/cider-nrepl "0.24.0"]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.walmartlabs/lacinia-pedestal "0.14.0"]
                 [com.walmartlabs/lacinia "0.37.0"]
                 [org.postgresql/postgresql "42.2.2"]
                 [com.layerware/hugsql "0.5.1"]
                 [io.aviso/logging "0.3.2"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [com.mchange/c3p0 "0.9.5.5"]
                 [com.stuartsierra/component "1.0.0"]])
  ;:repl-options {:init-ns clojure-game-geek.core})
