(ns spitter.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
     [:title "Spitter! (your daily speed reader)"]
     [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]
     [:link { :href "http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" :rel "stylesheet" }]
     (include-css "/css/style.css")]
    [:body
     [:div
     [:h1 "Spitter!"]]]))
