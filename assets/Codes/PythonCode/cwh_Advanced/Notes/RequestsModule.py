# lets know about Requests Module in Python , it helps to make http requests in python and it is pre-installed module in python.

import requests # this is a pre-installed module in python.

# Lets take a response from the website

response = requests.get("https://ushcodes.netlify.app") # this will get the response from the website and save it in response

# used get(url) method to send request to the url website and save it in response

print(response.text) # this will print the content of the website

# As you saw in the output , some html codes, Which is nothing but the Code of My Website whic i had written to create it.

    