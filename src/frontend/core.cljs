(ns frontend.core
  "This namespace contains your application and is the entrypoint for 'yarn start'."
  (:require [reagent.core :as r]
            [frontend.grid :as grid]))

(defn app []
  [:<>
   [:h1 "Hello!"]
   [grid/component]])

(defn ^:dev/after-load render
  "Render the toplevel component for this app."
  []
  (r/render [app] (.getElementById js/document "app")))

(defn ^:export main
  "Run application startup logic."
  []
  (render))
