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
     [:div.container
      [:div.jumbotron
       [:h1 "Spitter!"]
       [:p "Read your twitter stream in blasing speed!"]
       [:input#stream.form-control.input-lg { :type "textarea" :placeholder "Your twitter stream" :style "width: 400px" }]
       [:button#play.btn.btn-success "Play!"]
       [:button#stop.btn.btn-inverse "Stop"]
       ]]
     [:script { :src "/js/spitter.js" }]
     [:script { :src "http://code.jquery.com/jquery.js" }]
     [:script { :src "http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js" }]]))
                                      
