(ns quil-workflow.core
  (:use [quil core]))

(defn setup []
  (smooth)
  (frame-rate 1)
  (background 200))

(defn draw []
   (stroke (random 255) (random 255) (random 255))
  (stroke-weight (random 10))
  (fill (random 255))

  (let [diam (random 100)
        x    (random (width))
        y    (random (height))]
    (ellipse x y diam diam)))

(defsketch example                
  :title "Oh so many grey circles"
  :setup setup           
  :draw draw              
  :size [323 200])
