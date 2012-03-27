class MergeSorter

  def merge(left, right)
    output = []

    until  left.empty? or right.empty?

        if left.first <= right.first
          output << left.shift
        else
          output << right.shift
        end

    end

    output.concat(left).concat(right)
  end

  def sort(input)
    if(input.size <= 1)
      return input
    else
      middle = input.length % 2 == 0 ? input.length / 2 : (input.length + 1) / 2
      left = input[0..middle-1]
      right = input[middle..input.length-1]

      merge(sort(left), sort(right))
    end
  end

end