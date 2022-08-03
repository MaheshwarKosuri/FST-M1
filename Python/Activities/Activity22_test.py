import pytest


def test_addition():
    a = 2
    b = 3
    s = 5
    assert s == a+b


def test_subtraction():
    a = 1
    b = 5
    assert b-a == 4


@pytest.mark.activity
def test_mul():
    a = 3
    b = 9
    m = a * b
    assert m == 21


@pytest.mark.activity
def test_div():
    a = 4
    b = 4
    assert a/b == 1