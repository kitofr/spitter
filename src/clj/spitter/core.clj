(ns spitter.core
  (:use compojure.core
        spitter.views)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (index-page))

  (route/resources "/")
  (route/not-found "404 - Page not found"))

(def handler
  (handler/site app-routes))
