(ns clojure-game-geek.db
  (:require [com.stuartsierra.component :as component]))


(def config
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/clj_game_geek"})
