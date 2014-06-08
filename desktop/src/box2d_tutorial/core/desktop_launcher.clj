(ns box2d-tutorial.core.desktop-launcher
  (:require [box2d-tutorial.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. box2d-tutorial "box2d-tutorial" 800 600)
  (Keyboard/enableRepeatEvents true))
