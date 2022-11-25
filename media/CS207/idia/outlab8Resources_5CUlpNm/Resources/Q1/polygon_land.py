def minCost(values):
    r"""
        This function accepts list
        It returns the result as cost.
    """
    pass


if __name__ == "__main__":
    import argparse
    CLI=argparse.ArgumentParser()
    CLI.add_argument("--values",  nargs="*",  type=int, default=[1, 2, 3])
    args = CLI.parse_args()
    print("values: %r" % args.values)
    cost = minCost(args.values)
    print(cost)