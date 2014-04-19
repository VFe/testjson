(ns testjson.routes.home
  (:use compojure.core)
  (:require [testjson.views.layout :as layout]
            [testjson.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/wtf" {params :params}
       (println params)))
