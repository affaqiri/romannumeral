Please find attached the implementation of Roman Numeral to Integer Kata as well as a very basic REST API service exposing the
implemented converter services.

The implementation follows the fluent interface approach for improved readability.

This Kata is well known when approaching TDD as it lets developers derive the final algorithm using strict TDD step by step.

Starting with I, II, III you write your algorithm in a very simple way without any loop just to pass the test cases associated
with these initial cases then you start identifying a pattern where you can transform your initial code treating each case
separately into a loop doing just some concatenation of the letter 'I' as the number progresses and subtracting 1 from the initial number.
At this stage, our loops is limited to number 3 just to pass the tests.
You then reach the case 'IV' which can no longer be treated by your refactored loop dealing with the first three numbers.
You start treating the 'IV' and 'V' as separate cases in addition to your initial loop that treats the first three elements.
The initial loop treating the first three elements give us an idea that we can treat all elements just by concatenating Roman symbols
and subtracting the value associated with that symbol from the initial number. 

For this, we need to identify all the Roman symbols with their associated values as well as some combined Roman symbols such as CS, XC, etc.
which do not quite adhere to the rule that a symbol with greater value should always precede a symbol with lower value.

Beside that, including these combined numbers directly in our data structure let us write simple algorithms for our converters and 
as a consequence let us not deal with cases where we should test whether we should do an addition or subtraction based on the
relative position of Roman symbols with each other. 

Most of the time, I find it better to write simple, readable and clean code even at the expense of some minor performance issues 
rather than writing complex algorithms needing readers hours to decode. Most of the time, even the performance gained in such
complex algorithms is negligible for most of web calculations.

Being really busy these times, I am sorry for not describing more the details of algorithms. 

I prefer talking directly if you have any question.

The converters deal correctly with most use cases as described in my test cases and the main application that outputs numbers
from 1 to 3999 but do not treat Roman Numbers which are semantically incorrect such as XIXX which is an invalid Roman number.

The service API is built using standard JAX-RS with Jersey as implementation. As described in the class file of this service,
i do not validate input parameters, inform correctly the client about eventual exceptions, and only XML format is used as output
to the client.

There is a basic Embedded Jetty Server as well as a testing Jersey Rest client for testing the output of services from client side.

The project is a simple maven project with all the required dependencies.

Regards,

Ahmad  
   