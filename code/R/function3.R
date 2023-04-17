function3 <- function(x,y) {
    max = max(max(x), 0)
    min = min(min(x), 0)
    seq = seq(min, max + y, by = y)
    table(cut(x, seq))
}
