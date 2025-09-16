def so_sweet(a, c):
    a_x, a_y, a_z = map(int, a.split())
    c_x, c_y, c_z = map(int, c.split())
    
    return f"{c_x - a_z} {c_y // a_y} {c_z - a_x}"


if __name__ == "__main__":
    a = input()
    c = input()
    print(so_sweet(a, c))