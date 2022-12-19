
%dw 2.0
output application/dw 
---
[{
    firstname : "Agnes",
    lastname : "Smoote",
    "type" : "quis",
    address : "Third St 69",
    country : "Nicaragua",
    miles : 90,
    creationdate : |2003-02-01|,
  } as Object { class: "com.mulesoft.training.Accounts"},
{
    firstname : "Cletus",
    lastname : "Davley",
    "type" : "sit",
    address : "Golden Gate Ave 12",
    country : "Norway",
    miles : 59,
    creationdate : |2011-07-08|,
  } as Object { class: "com.mulesoft.training.Accounts"}]
