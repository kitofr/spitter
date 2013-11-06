(ns spitter.views
  (:use [hiccup core page]))

(defn index-page []
  (html5
    [:head
     [:title "Spitter! (your daily speed reader)"]
     [:meta { :name "viewport" :content "width=device-width, initial-scale=1.0" }]
     [:link { :href "/js/components/bootstrap/dist/css/bootstrap.min.css" :rel "stylesheet" }]
     (include-css "/css/style.css")]
    [:body
     [:div.container
      [:div.jumbotron
       [:h1 "Spitter!"]
       [:p "Read your twitter stream in blasing speed!"]
       [:input#stream.form-control.input-lg { :type "textarea" :placeholder "Your twitter stream" :style "width: 400px" }]
       [:div.btn-group
        [:button#play.btn.btn-success "Play!"]
        [:button#stop.btn.btn-inverse "Stop"]
        [:button#reset.btn.btn-inverse "Reset"]]
       [:div#speed]]]
     [:script { :src "/js/spitter.js" }]
     [:script { :src "/js/components/jquery/jquery.min.js" }]
     [:script { :src "/js/components/bootstrap/dist/js/bootstrap.min.js" }]]))
                                      
