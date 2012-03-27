require 'test/unit'
require_relative './mergesorter'

class MergeSortUnitTests < Test::Unit::TestCase

  def test_emptyArray()
    input = []
    sorter = MergeSorter.new()
    output = sorter.sort(input)
    assert_equal(output, [])
  end
  
  def test_oneElementArray()
    input = [1]
    sorter = MergeSorter.new()
    output = sorter.sort(input)
    assert_equal(output, [1])
  end
  
  def test_smallArrayWithDistinctElements()
    input = [1, 5, 2, 4]
    sorter = MergeSorter.new()
    output = sorter.sort(input)
    assert_equal([1, 2, 4, 5], output)
  end
  
  def test_smallArrayWithSomeSameElements()
    input = [1, 5, 2, 3, 3]
    sorter = MergeSorter.new()
    output = sorter.sort(input)
    assert_equal([1, 2, 3, 3, 5], output)
  end

end