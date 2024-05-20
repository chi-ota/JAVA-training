 const stripe = stripe('pk_test_51PBGq7LdOr2RmW2sXO5SHY6rbM38IQKR86Ib76uiWqsLTf1u9D9jtqM5r6w0fLLomKwlesiRB9fhPKWJTAWDx6Ld00lb2IHdiJ');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe().redirectToCheckout({
     sessionId: sessionId
   })
 });