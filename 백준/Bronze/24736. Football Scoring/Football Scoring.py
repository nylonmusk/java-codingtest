visit = list(map(int, input().split()))
home = list(map(int, input().split()))

def calculate_score(scores):
    T, F, S, P, C = scores
    total_score = T * 6 + F * 3 + S * 2 + P * 1 + C * 2
    return total_score

visit_score = calculate_score(visit)
home_score = calculate_score(home)

print(visit_score, home_score)