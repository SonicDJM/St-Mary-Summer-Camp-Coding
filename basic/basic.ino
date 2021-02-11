void setup() {
  pinMode(13, OUTPUT);

}

void loop() {
  digitalWrite(LED, HIGH);
  delay(timer);
  digitalWrite(LED, LOW);
  timer = timer - 100;
}
