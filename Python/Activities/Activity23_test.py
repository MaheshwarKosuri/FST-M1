import pytest


def test_sum(num_list):
    s = 0
    for i in num_list:
        s = s + i

    assert s == 55




