document.addEventListener('DOMContentLoaded', () => {
  const dots = document.querySelectorAll('.pin__dot');
  const keys = document.querySelectorAll('.pin__key');
  const errorText = document.querySelector('.pin__dsc');

  let enteredPin = "";

  keys.forEach(key => {
    key.addEventListener('click', () => {
      const value = key.textContent.trim();

      // Delete key
      if (key.classList.contains('pin__key--del')) {
        enteredPin = enteredPin.slice(0, -1);
      }
      // Number key
      else if (enteredPin.length < 6 && /^[0-9]$/.test(value)) {
        enteredPin += value;
      }

      // Update dot UI
      dots.forEach((dot, index) => {
        dot.classList.toggle('is-filled', index < enteredPin.length);
      });

      // Check PIN
      if (enteredPin.length === 6) {
        if (enteredPin === "123456") {
          window.location.href = "bank_main.html";
        } else {
          errorText.style.display = "block";
          enteredPin = "";
          dots.forEach(dot => dot.classList.remove('is-filled'));
        }
      }
    });
  });
});
