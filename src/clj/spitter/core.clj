(ns spitter.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "<p>Hello from compojure</p>")

  (route/resources "/")
  (route/not-found "404 - Page not found"))

(def handler
  (handler/site app-routes))
