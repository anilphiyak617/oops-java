while inotifywait -e modify  Lecture1.java; do
   javac Lecture1.java && java Lecture1 
done
