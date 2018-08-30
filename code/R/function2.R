function2 <- function(N){
  factorial(N)/( factorial(N-(0:N))*factorial(0:N) )
}