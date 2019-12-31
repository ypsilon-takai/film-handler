(ns film-rating.handler.example
  (:require [ataraxy.core :as ataraxy]
            [ataraxy.response :as response] 
            [clojure.java.io :as io]
            [integrant.core :as ig]))

(defmethod ig/init-key :film-rating.handler/example [_ options]
  (fn [{[_] :ataraxy/result}]
    [::response/ok (io/resource "film_rating/handler/example/example.html")]))
